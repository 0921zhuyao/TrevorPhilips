package net.wendal.nutzbook.module;

import org.nutz.dao.Dao;
import org.nutz.log.Log;
import org.nutz.log.Logs;
import org.nutz.runner.NutRunner;
import org.nutz.trans.Atom;
import org.nutz.trans.Trans;
import org.omg.CORBA.TRANSACTION_MODE;

/**
 * 有返回值的线程
 */
public class TestTask extends NutRunner{

	protected Dao dao;
	
	protected static final Log log = Logs.get();
	
	volatile boolean stop = false;
	
	public TestTask(String rname) {
		super(rname);
		System.out.println("这是线程" + rname);
	}

	@Override
	public long exec() throws Exception {
		try {
			log.debug("进入方法");
			while(!stop){
				System.out.println("用户进入");
				System.out.println(Thread.currentThread().getName());
			}
		} catch (Exception e) {
			
		} finally {
			
		}
		return 0;
	}
	
	@Override
	public void reg(NutRunner me) {
		log.debug("线程启动");
	}

	@Override
	public void unreg(NutRunner me) {
		log.debug("线程关闭");
	}
 
	public static void main(String[] args) {
		TestTask thread = new TestTask("thread1");
		Thread t1 = new Thread(thread);
		//Thread t2 = new Thread(new TestTask("thread2"));
		t1.start();
		thread.stop = true;
		//t2.start();
	}
}
