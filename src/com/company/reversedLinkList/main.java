package com.company.reversedLinkList;

import com.company.LNode.LNode;

public class main {
	/*
	方法功能：对单链表进行逆序输入参数：head链表头结点
	 */
	public static void Reverse(LNode head){
		// 判断链表是否为空
		if (head == null || head.next == null)
			return;
		LNode pre = null;   // 前驱结点
		LNode cur = null;   // 当前结点
		LNode next = null;
		// 把链表首结点变为尾结点
		cur = head.next;
		next = cur.next;
		cur.next = null;
		pre = cur;
		cur = next;
		//使当前遍历到的结点cur指向其前驱结点
		while (cur.next != null){
			next = cur.next;
			cur.next = cur;
			pre = cur;
			cur = cur.next;
			cur = next;
		}
		// 结点最后一个结点指向倒数第二个结点
		cur.next = pre;
		head.next = cur;
	}

	public static void main(String[] args) {

	}
}
