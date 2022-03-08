package mao.spring_mvc_converter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Project name(项目名称)：Spring_MVC_Converter
 * Package(包名): mao.spring_mvc_converter
 * Class(类名): MMyController
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/8
 * Time(创建时间)： 21:29
 * Version(版本): 1.0
 * Description(描述)：
 * 内置的类型转换器
 * 1）标量转换器
 * 名称	作用
 * StringToBooleanConverter	String 到 boolean 类型转换
 * ObjectToStringConverter	Object 到 String 转换，调用 toString 方法转换
 * StringToNumberConverterFactory	String 到数字转换（例如 Integer、Long 等）
 * NumberToNumberConverterFactory	数字子类型（基本类型）到数字类型（包装类型）转换
 * StringToCharacterConverter	String 到 Character 转换，取字符串中的第一个字符
 * NumberToCharacterConverter	数字子类型到 Character 转换
 * CharacterToNumberFactory	Character 到数字子类型转换
 * StringToEnumConverterFactory	String 到枚举类型转换，通过 Enum.valueOf 将字符串转换为需要的枚举类型
 * EnumToStringConverter	枚举类型到 String 转换，返回枚举对象的 name 值
 * StringToLocaleConverter	String 到 java.util.Locale 转换
 * PropertiesToStringConverter	java.util.Properties 到 String 转换，默认通过 ISO-8859-1 解码
 * StringToPropertiesConverter	String 到 java.util.Properties 转换，默认使用 ISO-8859-1 编码
 * <p>
 * 2）集合、数组相关转换器
 * 名称	作用
 * ArrayToCollectionConverter	任意数组到任意集合（List、Set）转换
 * CollectionToArrayConverter	任意集合到任意数组转换
 * ArrayToArrayConverter	任意数组到任意数组转换
 * CollectionToCollectionConverter	集合之间的类型转换
 * MapToMapConverter	Map之间的类型转换
 * ArrayToStringConverter	任意数组到 String 转换
 * StringToArrayConverter	字符串到数组的转换，默认通过“，”分割，且去除字符串两边的空格（trim）
 * ArrayToObjectConverter	任意数组到 Object 的转换，如果目标类型和源类型兼容，直接返回源对象；否则返回数组的第一个元素并进行类型转换
 * ObjectToArrayConverter	Object 到单元素数组转换
 * CollectionToStringConverter	任意集合（List、Set）到 String 转换
 * StringToCollectionConverter	String 到集合（List、Set）转换，默认通过“，”分割，且去除字符串两边的空格（trim）
 * CollectionToObjectConverter	任意集合到任意 Object 的转换，如果目标类型和源类型兼容，直接返回源对象；否则返回集合的第一个元素并进行类型转换
 * ObjectToCollectionConverter	Object 到单元素集合的类型转换
 */


@Controller
public class MyController
{
    /**
     * Test 1 string.
     *
     * @param a     the a
     * @param b     the b
     * @param model the model
     * @return the string
     */
    @RequestMapping("test1")
    public String test1(@RequestParam int a, @RequestParam int b, Model model)
    {
        String s = "数字：" + a + "和" + b + "相加结果：" + (a + b);
        model.addAttribute("message", s);
        return "test1";
    }

    /**
     * Add user string.
     *
     * @return the string
     */
    @RequestMapping("/addUser")
    public String addUser()
    {
        return "addUser";
    }

    /**
     * My converter string.
     *
     * @param user  the user
     * @param model the model
     * @return the string
     */
    @RequestMapping("/converter")
    public String myConverter(@RequestParam("user") User user, Model model)
    {
        model.addAttribute("user", user);
        return "showUser";
    }
}
