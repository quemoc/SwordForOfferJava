package problem10;
/*
 * ������10����������1�ĸ���
 * ʵ��һ������������һ��������������������Ʊ�ʾ��1�ĸ���������9�Ķ�������1001�������2��
 * λ�������֪ʶ��λ���㹲5�֣���(&)��ͬʱΪ1��Ϊ1����(|)����һ��Ϊ1����1�����(^)�ǲ���ͬΪ1��
 * ���������m<<n��ʾ��m����nλ������ߵ�nλ��������ͬʱ�����ұ߲�n��0��
 * ���������m>>n��ʾm����nλ�����ұ�nλ������ע�⣬���������һ���޷�����ֵ������0�����ߵ�nλ��������з�����ֵ����������߲�n��0��������n��1��
 * ˼·1�����ж϶����Ʊ�ʾ������1λ�ǲ���1����������1�������㼴�ɣ�Ȼ������һλ�����жϣ�ֱ��������Ϊ0��
 * ����������һλ�Ͱ���������2����ѧ���ǵȼ۵ĵ���λ����Ч����ߣ�����˼·1���ܻ�������ѭ����������һ������0x8000������֮�󲢲���0x4000������0xC000����Ϊ������λ��Ҫ��1�����ѭ����ȥ����0xFFFF��
 * ˼·2��Ϊ�˱�����ѭ����Ҫ�������ƣ��������Ȱ����ֺ�1�������㣬�ж������λ�ǲ���1�����Ű�1����һλ�õ�2���ں������������㣬�����жϴε�λ�ǲ���1���������Ƽ��ɡ�
 * ˼·3��˼·2����������Ķ����Ʊ�ʾ�м�λ������ͻ�ѭ�����ٴΣ��Ľ���˼·3�Ƕ��������м���1��ѭ�����Ρ����ȼ�סһ��������������һ��������ȥ1֮���ٺ�ԭ����������λ�����㣬�õ��Ľ���൱�ڰ����������Ʊ�ʾ�е����ұ�һ��1���0��
 * ��������������һ�������Ķ����Ʊ�ʾ���ж��ٸ�1���Ϳ��Խ��ж��ٴ������Ĳ�����
 * �����Ŀ1����һ������ж�һ�������ǲ���2�������η���һ�����������2�������η�����ô���Ķ����Ʊ�ʾ�����ҽ���һλ��1���������Ϸ��������������ȥ1֮���ٺ����Լ��������㣬���������Ψһ��1�ͻ���0��
 * �����Ŀ2����������m��n��������Ҫ�ı�m�Ķ����Ʊ�ʾ�еĶ���λ���ܵõ�n������10��ʾΪ1010��13��ʾΪ1101����ı�1010��3λ���ܵõ�1101�����˼·�ǣ������������������Ȼ��ͳ���������1�ĸ�����
 */
public class NumberOf1 {
	static Integer numberof1(int number){
		int count = 0;
		while(number != 0){
			number = (number - 1) & number;
			count++;
		}
		return count;
	}
	public static void main(String[] args){
		System.out.println(numberof1(10));
	}
}