package com.imooc.reflect;

public class Office {
	
	public static void main(String[] args) {
//		new创建对象是静态加载类，在编译时就需要加载所有可能使用到的类
//		现在有word类，没有excel类，编译过不了，该程序无法执行
//		通过动态加载类可以解决该问题
		if("Word".equals(args[0])){
			Word w=new Word();
			w.start();
		}
		if("Excel".equals(args[0])){
			Excel e=new Excel();
			e.start();
		}
	}

}
