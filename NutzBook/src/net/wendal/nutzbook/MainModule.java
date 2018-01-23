package net.wendal.nutzbook;

import org.nutz.mvc.annotation.Fail;
import org.nutz.mvc.annotation.IocBy;
import org.nutz.mvc.annotation.Modules;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.SetupBy;
import org.nutz.mvc.ioc.provider.ComboIocProvider;

@Modules(scanPackage = true)
@Ok("ioc:json")
@Fail("ioc:json")
@IocBy(type=ComboIocProvider.class, args={"*org.nutz.ioc.loader.json.JsonLoader","ioc/",
        // 这个package下所有带@IocBean注解的类,都会登记上
                            "*anno", "net.wendal.nutzbook",
                            "*tx", // 事务拦截 aop
                            "*async"}) // 异步执行aop
@SetupBy(value=MainSetup.class)
public class MainModule {

}
