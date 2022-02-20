package t1;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Project name(项目名称)：Spring_Bean属性注入
 * Package(包名): t1
 * Class(类名): Grade
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/2/20
 * Time(创建时间)： 19:45
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Grade
{
    private static final Log LOGGER = LogFactory.getLog(Grade.class);
    private Integer gradeId;
    private String gradeName;

    public Grade(Integer gradeId, String gradeName)
    {
        LOGGER.info("正在执行 Course 的有参构造方法，参数分别为：gradeId=" + gradeId + ",gradeName=" + gradeName);
        this.gradeId = gradeId;
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
