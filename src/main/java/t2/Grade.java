package t2;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Project name(项目名称)：Spring_Bean属性注入
 * Package(包名): t2
 * Class(类名): Grade
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/2/20
 * Time(创建时间)： 20:07
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Grade
{
    private static final Log LOGGER = LogFactory.getLog(Grade.class);
    private Integer gradeId;
    private String gradeName;

    /**
     * 无参构造函数
     * 若该类中不存在其他的带参构造函数，则这个默认的无参构造函数可以省略
     */
    public Grade()
    {
    }

    public void setGradeId(Integer gradeId)
    {
        LOGGER.info("正在执行 Grade 类的 setGradeId() 方法…… ");
        this.gradeId = gradeId;
    }

    public void setGradeName(String gradeName)
    {
        LOGGER.info("正在执行 Grade 类的 setGradeName() 方法…… ");
        this.gradeName = gradeName;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("gradeId：").append(gradeId).append('\n');
        stringbuilder.append("gradeName：").append(gradeName).append('\n');
        return stringbuilder.toString();
    }
}
