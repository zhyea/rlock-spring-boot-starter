package org.chobit.spring.rlock;


import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * kafka stater annotation
 *
 * @author rui.zhang
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@AutoConfigurationPackage
@Import(RLockConfiguration.class)
public @interface EnableRLock {


}
