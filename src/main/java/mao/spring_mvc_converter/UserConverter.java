package mao.spring_mvc_converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * Project name(项目名称)：Spring_MVC_Converter
 * Package(包名): mao.spring_mvc_converter
 * Class(类名): UserConverter
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/8
 * Time(创建时间)： 21:44
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Component
public class UserConverter implements Converter<String, User>
{
    @Override
    public User convert(String source)
    {
        // 创建User实例
        User user = new User();
        // 以“，”分隔
        String[] str = source.split(",");
        if (str.length == 3)
        {
            // 为user实例赋值
            user.setName(str[0]);
            user.setAge(Integer.parseInt(str[1]));
            user.setHeight(Double.parseDouble(str[2]));
            return user;
        }
        else
        {
            throw new IllegalArgumentException(String.format("类型转换失败， 需要格式name,age,height,但格式是[%s]", source));
        }
    }
}
