package com.tech.kj.dp.proxy.dynamic;

import java.lang.reflect.Method;

import com.tech.kj.dp.proxy.Image;

import net.sf.cglib.proxy.InvocationHandler;

public class ImageProxyInvocationHandler implements InvocationHandler {
	
	public ImageProxyInvocationHandler(Image orignal) {
	}
	public ImageProxyInvocationHandler() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object invoke(Object targetObject, Method method, Object[] parameters) throws Throwable {
		
		if(method.getDeclaringClass()!=Object.class) {
			return method.invoke(targetObject, parameters);
		}	else {
			throw new RuntimeException("Do not know what to do");
		}		
	}

}
