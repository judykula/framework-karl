/*
 * easy come, easy go.
 *
 * contact : syiae.jwy@gmail.com
 *
 * · · · · ||   ..     __       ___      ____  ®
 * · · · · ||  ||  || _ ||   ||    ||   ||      ||
 * · · · · ||  ||  \\_ ||_.||    ||   \\_  ||
 * · · _//                                       ||
 * · · · · · · · · · · · · · · · · · ·· ·    ___//
 */
package com.jwy.karl;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.context.annotation.PropertySource;

/**
 * <p>
 *     引入配置中心，比如apollo
 * </p>
 * <p>
 *     通常我们的项目配置文件由如下三部分构成：
 *
 *     <ul>
 *         <li>application.properties: 项目基础配置</li>
 *         <li>environment.properties: 环境配置，比如数据库、redis、consul等中间件配置</li>
 *         <li>customized.properties: 自定义配置，比如自己些的@Value属性信息</li>
 *     </ul>
 * </p>
 *
 * @author Jiang Wanyu
 * @version 1.0
 * @date 2023/10/30
 */
@EnableApolloConfig
@PropertySource(
        value = {
                "environment.properties",
                "customized.properties"
        },
        ignoreResourceNotFound = true
)
public class MyConfigConfiguration {

}
