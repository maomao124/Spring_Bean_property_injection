package t4;

/**
 * Project name(项目名称)：Spring_Bean属性注入
 * Package(包名): t4
 * Class(类名): Employee
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/2/20
 * Time(创建时间)： 20:27
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Employee
{
    //员工编号
    private String empNo;
    //员工姓名
    private String empName;
    //部门信息
    private Dept dept;

    public Employee(String empNo, String empName, Dept dept)
    {
        this.empNo = empNo;
        this.empName = empName;
        this.dept = dept;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("empNo：").append(empNo).append('\n');
        stringbuilder.append("empName：").append(empName).append('\n');
        stringbuilder.append("dept：").append(dept).append('\n');
        return stringbuilder.toString();
    }
}
