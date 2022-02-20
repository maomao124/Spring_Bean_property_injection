package t2;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Project name(项目名称)：Spring_Bean属性注入
 * Package(包名): t2
 * Class(类名): Student
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/2/20
 * Time(创建时间)： 20:06
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Student
{
    private static final Log LOGGER = LogFactory.getLog(Student.class);
    private int id;
    private String name;
    private Grade grade;

    //无参构造方法，在没有其他带参构造方法的情况下，可以省略
    public Student()
    {
    }

    //id 属性的 setter 方法
    public void setId(int id)
    {
        LOGGER.info("正在执行 Student 类的 setId() 方法…… ");
        this.id = id;
    }

    //name 属性的 setter 方法
    public void setName(String name)
    {
        LOGGER.info("正在执行 Student 类的 setName() 方法…… ");
        this.name = name;
    }

    public void setGrade(Grade grade)
    {
        LOGGER.info("正在执行 Student 类的 setGrade() 方法…… ");
        this.grade = grade;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("id：").append(id).append('\n');
        stringbuilder.append("name：").append(name).append('\n');
        stringbuilder.append("grade：").append(grade).append('\n');
        return stringbuilder.toString();
    }

}
