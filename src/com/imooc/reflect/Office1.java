package com.imooc.reflect;

class Office1{
	
	public static void main(String[] args) {
//		new���������Ǿ�̬�����࣬�ڱ���ʱ����Ҫ�������п���ʹ�õ�����,��ʹ����ҲҪ���ء�
//		������word�࣬û��excel�࣬��������ˣ��ó����޷�ִ��
//		ͨ����̬��������Խ��������
		try {
//			��̬������
			System.out.println(args);
			System.out.println(args.length);
			Class c=Class.forName(args[0]);//��Ƶ���ԣ������ﱨ��δ�⣿��Ƶ������myeclipse����ʾ��
//			ͨ�������ͣ������������
//			Word w=(Word)c.newInstance();
			OfficeAble oa=(OfficeAble)c.newInstance();
			oa.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
