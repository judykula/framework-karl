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
 *     配置
 * </p>
 *
 * @author Jiang Wanyu
 * @version 1.0
 * @date 2023/10/30
 */
@EnableApolloConfig
@PropertySource(
        value = {
                "common.properties"
        },
        ignoreResourceNotFound = true
)
public class MyConfigConfiguration {

}
