package com.Assinment.innerclass;

public class InnerclassDemo {
	
		private String msg = "Hi! Welcome to collage";
		
		
		void display() {
			class Inner {
				void msg() {
					System.out.println(msg);
				}
			}
			
			Inner innerObj = new Inner();
			innerObj.msg();
		}
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			InnerclassDemo demo = new InnerclassDemo();
			demo.display();

		}

	}



