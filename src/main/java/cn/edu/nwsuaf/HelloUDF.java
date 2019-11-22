package cn.edu.nwsuaf;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

/**
 * create by liuzhiwei on 2019-11-22
 * 需求：输入xxx,输出Hello:xxx
 */
public class HelloUDF extends UDF {
    public Text evaluate(Text input) {
        return new Text("Hello:" + input);
    }

    public static void main(String[] args) {
        HelloUDF udf = new HelloUDF();
        Text result = udf.evaluate(new Text("zhangsan"));
        System.out.println(result.toString());

    }


}
