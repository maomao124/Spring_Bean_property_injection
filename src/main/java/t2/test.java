package t2;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Project name(项目名称)：Spring_Bean属性注入
 * Package(包名): t2
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/2/20
 * Time(创建时间)： 20:14
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test
{
    private static final Log LOGGER = LogFactory.getLog(t1.test.class);

    public static void main(String[] args)
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
        t2.Student student = (t2.Student) applicationContext.getBean("student2");
        student = applicationContext.getBean(Student.class);
        LOGGER.info(student.toString());
    }
}
