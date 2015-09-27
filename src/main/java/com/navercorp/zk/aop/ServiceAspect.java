package com.navercorp.zk.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class ServiceAspect {
	private static final Logger logger = LoggerFactory.getLogger(ServiceAspect.class);
	
	public void serviceBefore(JoinPoint joinPoint) {
		logger.info("call beforeService");
	}
	
	public void serviceAfter(JoinPoint joinPoint) {
		logger.info("call afterService");
	}
	
	public void arround(ProceedingJoinPoint joinpoint) {
		try {
			serviceBefore(joinpoint);
			
			MethodSignature ms = (MethodSignature)joinpoint.getSignature();
			
			logger.info("called method name is " + ms.getMethod().getName());
			
			serviceAfter(joinpoint);
		} catch (Throwable t) {
			logger.debug(t.getMessage());
		}
	}
}
