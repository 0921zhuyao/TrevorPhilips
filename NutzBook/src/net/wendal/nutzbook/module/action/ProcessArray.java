package net.wendal.nutzbook.module.action;

public class ProcessArray {

	public void process(int[] targer, net.wendal.nutzbook.dao.Command cmd){
		cmd.process(targer);
	}
}
