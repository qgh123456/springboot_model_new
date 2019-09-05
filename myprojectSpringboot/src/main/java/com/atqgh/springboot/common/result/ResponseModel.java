package com.atqgh.springboot.common.result;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import javax.servlet.http.HttpServletResponse;
import java.io.Serializable;

/**
 * @author qiguohui
 * 返回的数据实体
 */
@Getter
@Setter
@ToString
public class ResponseModel<T> implements Serializable {

    private static final long serialVersionUID = -1241360949457314497L;
    private int status;
    private T result;
    private String message;
    private String code;

    public ResponseModel() {
        HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
                .getResponse();
        response.setCharacterEncoding("UTF-8");
    }
}
