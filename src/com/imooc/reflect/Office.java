package com.imooc.reflect;

public class Office {
	
	public static void main(String[] args) {
//		new���������Ǿ�̬�����࣬�ڱ���ʱ����Ҫ�������п���ʹ�õ�����
//		������word�࣬û��excel�࣬��������ˣ��ó����޷�ִ��
//		ͨ����̬��������Խ��������
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
