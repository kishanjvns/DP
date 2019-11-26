package com.tech.kj.dp.proxy.dynamic;

import java.lang.reflect.Method;

import com.tech.kj.dp.proxy.Image;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.InvocationHandler;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import net.sf.cglib.proxy.NoOp;

public class App {
	public static void main(String[] args) {
		Enhancer enhancer=new Enhancer();
		enhancer.setSuperclass(Image.class);		
		enhancer.setCallback(new ImageCallback2());
		Image i=(Image)enhancer.create();
		System.out.println(i.getContentLength());
		System.out.println(i.toString());
		
	}
}
class ImageCallback implements MethodInterceptor{

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		
		if(method.getDeclaringClass()!=Object.class) {
			System.err.println("intercepting");
			Object response= proxy.invokeSuper(obj, args);
			System.err.println("intercepted");
			return response;
		}else {
			return proxy.invokeSuper(obj, args);
		}
	}
	
}
class ImageCallback2 implements InvocationHandler{

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if(proxy instanceof Image) {
			System.err.println("true");
		}
		if (method.getDeclaringClass() != Object.class) {
			return method.invoke(proxy, args);
		} else {
			throw new RuntimeException("Do not know what to do");
		}
	}
	
}
