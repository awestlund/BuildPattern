

public class DemoApplication {
	public static void main(String[] args) {
		LunchOrder.Builder builder = new LunchOrder.Builder();
		builder.bread("wheat").meat("turkey").instructions("toast");

		LunchOrder lunchOrder = builder.build();

		System.out.println("Make a sandwhich with the following: ");
		System.out.println("Bread: " + lunchOrder.getBread());
		System.out.println("Condiments: " + lunchOrder.getCondiments());
		System.out.println("Meat: " + lunchOrder.getMeat());
		System.out.println("Instructions: " + lunchOrder.getInstructions());
	}
}
