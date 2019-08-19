package rensyu;

import java.util.ArrayList;
import java.util.List;

public class ListSample {


	public static void main(String[] args) {
		List<String>list = new ArrayList<String>();

		//値の記憶はadd
		list.add("田中");
		list.add("佐藤");
		list.add("菊池");
		list.add("マツダ");
		list.add("中村");

		//値の取得
		for(int i=0;i<list.size();i++){
			//値の取得はget
			System.out.println(list.get(i));
		}


		for(String s:list){
			System.out.println(s);
		}
	}



}
