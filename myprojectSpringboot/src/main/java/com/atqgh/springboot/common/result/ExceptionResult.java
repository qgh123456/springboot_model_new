package com.atqgh.springboot.common.result;

import com.atqgh.springboot.common.enums.ExceptionEnum;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * @author bystander
 * @date 2018/9/15
 *
 * 自定义异常结果类
 */
@Data
@NoArgsConstructor
public class ExceptionResult {

    private int status;
    private String message;
    private String timestamp;

    public ExceptionResult(ExceptionEnum em) {
        this.status = em.getCode();
        this.message = em.getMsg();
//        this.timestamp = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("", Locale.SIMPLIFIED_CHINESE);
        simpleDateFormat.applyPattern("yyyy/MM/dd HH:mm:ss");
        timestamp = simpleDateFormat.format(System.currentTimeMillis());
//        System.out.println(simpleDateFormat.format(System.currentTimeMillis()));
    }

    public ExceptionResult(int status,String message) {
        this.status = status;
        this.message = message;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("", Locale.SIMPLIFIED_CHINESE);
        simpleDateFormat.applyPattern("yyyy/MM/dd HH:mm:ss");
        this.timestamp = simpleDateFormat.format(System.currentTimeMillis());
    }

}
