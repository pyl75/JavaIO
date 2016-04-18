package com.huida.io;

public class ModeDemo {
	public static void main(String[] args) {
		House h = new House();
		h.livePerson();
		BigHouse bh = new BigHouse(h);
		bh.livePerson();
		
	}

}
class House{
	
	public void livePerson(){
		
		System.out.println("◊°»À");
	}
}
//map.baidu.
//ditu.goole
class BigHouse{
	House h;
	BigHouse(House h){
		this.h = h;
		
	}
	public void livePerson(){
		System.out.println("”Œ”æ");
		h.livePerson();
		System.out.println("ktv");
	}
	
	
}
