package com.ckjava.utils;

import com.ckjava.xutils.Constants;
import com.ckjava.xutils.JsonUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HttpResponseUtils implements Constants {

    private static final Logger logger = LoggerFactory.getLogger(HttpResponseUtils.class);

    /**
     * 处理 json 响应
     *
     * @param response {@code HttpServletResponse} 对象
     * @param obj 任意对象
     */
    public static void writeJsonResponse(HttpServletResponse response, Object obj) {
        response.setContentType("application/json;charset=UTF-8");
        try {
            JsonUtils.getMapper().writeValue(response.getWriter(), obj);
        } catch (IOException e) {
            logger.error("writeJsonResponse has error", e);
        }
    }

}
