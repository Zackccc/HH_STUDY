//��������ת��

/* 	1.��ʽ����ת��
		�Զ�ת����Сת��
	
	
	2.��ʽ����ת��
		��תС   ���ܴ��ھ�����ʧ���������
		
	3.ע��
		byte/short/char ������ʱ��ת��Ϊint��Ӧʹ��int����
		�ڸ��������и�ֵʱ���Ⱥ��Ҳ�ȫΪ������������javac��ֱ�ӽ����
		���и�ֵ����ֱ�ӽ�������ת���������������Ż�����
		short = 3 + 5;3��5����int�ͣ��������Զ���������ת����short����
 */
public class Demo03DataType{
	public static void main(String[] args){
		System.out.println(1020); // Ĭ��int
		System.out.println(3.14); // Ĭ��double	
		
		//int ת long ��ʽ����ת��
		long num1 = 100;
		System.out.println(num1); 
		
		double num2 = 3.1F;
		System.out.println(num2); 
		
		//long ת float float��Ȼռ��4�ֽڵ����ݷ�Χ����
		float num3 = 5L;
		System.out.println(num3);  
		
		//long ת int ��תС
		byte num4 = (byte)128L;  
		System.out.println(num4); //-128  
		
		//Ӧʹ��int����
		short num6 = 3;
		int num5 = num6 + num6;
		System.out.println(num5);
		
		//��ʽת�� Unicode��
		int num7 = '��';
		System.out.println(num7);
		
		
	}
}