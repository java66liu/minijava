package frame;

import java.util.List;

public interface Frame {
	/**
	 * ����һ���µ�֡
	 * @param method Ϊ�÷�������Frame
	 * @param formal �÷����Ĳ����Ƿ�escape
	 * @return �·����Frame
	 */
	public Frame newFrame(String method,List<Boolean> formal);
	/**
	 * ����һ���ֲ�����
	 * @param b �þֲ������Ƿ�escape
	 * @return ����һ��Accessָ����ƫ��
	 */
	public Access allocLocal(boolean b);

}
