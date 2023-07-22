package com.NPT.java8FeaturesLambdaExpressions;

import java.util.Random;

class Activities{
	 
	 public void Morning(String acts) throws InterruptedException{
		 
		 System.out.println(acts+ " is started");
		 Thread.sleep(2500);
		 System.out.println(acts+ " is Completed");
		}

	 public void Evening(String acts) throws InterruptedException{
		 System.out.println(acts+ " is Started");
		 Thread.sleep(3500);
		 System.out.println(acts+ " is Completed");
		 }

	 public void Night(String acts) throws InterruptedException{
		 System.out.println(acts+ " is Started");
		 Thread.sleep(5500);
		 System.out.println(acts+ " is Completed");
		 }
	
	
}
public class MultiThreading_LambdaExpressions {

	static String[] morning= {
	" Instagram "," Bowling ", "Youtube ", "Coding"
	};
	static String[] evening= {
	" Making Snacks "," Roaming around house ", "Sleeping ", "Coding"
	};
	static String[] night= {
	"Coding "," Watching TV ", "Walking ", "Using phone"
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Activities acts=new Activities();
		Random random=new Random();
		Runnable morningActivities = ()-> {
			try {
				acts.Morning(morning[random.nextInt(
						morning.length)]);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		};
		Thread m=new Thread(morningActivities);
		Runnable eveningActivities = ()-> {
			try { synchronized (m) {
                m.join(); // Wait until the 'm' thread completes its task
                acts.Evening(evening[random.nextInt(evening.length)]);
            
				}
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		};
		Thread e=new Thread(eveningActivities);
		Runnable nightActivities = ()-> {
			try { synchronized(e) {
				e.join();
				acts.Night(night[random.nextInt(night.length)]);
				
			}
			}
			catch(InterruptedException e1) {
				e1.printStackTrace();
			}
		};
		Thread n=new Thread(nightActivities);
	
		m.start();
		
		e.start();
		n.start();
	}

}
