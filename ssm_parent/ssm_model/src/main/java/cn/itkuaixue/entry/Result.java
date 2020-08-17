package cn.itkuaixue.entry;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author:libingcheng
 * @Data:2020/8/17 1:56 下午
 */
@Data
@AllArgsConstructor
public class Result {
    private boolean flag;       //执行结果，true为执行成功 false为执行失败
    private String message;     //返回结果信息
    private Object result;      //返回数据
    public Result(boolean flag,String message){
        this.flag = flag;
        this.message = message;
    }
}
