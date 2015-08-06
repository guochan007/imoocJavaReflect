package com.imooc.reflect;

class Office1{
	
	public static void main(String[] args) {
//		new创建对象是静态加载类，在编译时就需要加载所有可能使用到的类,即使不用也要加载。
//		现在有word类，没有excel类，编译过不了，该程序无法执行
//		通过动态加载类可以解决该问题
		try {
//			动态加载类
			System.out.println(args);
			System.out.println(args.length);
			Class c=Class.forName(args[0]);//视频可以，我这里报错，未解？视频不是在myeclipse中演示的
//			通过类类型，创建该类对象
//			Word w=(Word)c.newInstance();
			OfficeAble oa=(OfficeAble)c.newInstance();
			oa.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
