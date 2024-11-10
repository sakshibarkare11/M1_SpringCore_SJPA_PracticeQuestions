import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the user Name:");
        String name=scanner.next();
        System.out.println("Enter the title of Image:");
        String title=scanner.next();
        System.out.println("Enter the size of Image (in KB):");
        int size=scanner.nextInt();
        System.out.println("Enter the width of Image (in pixels):");
        int width=scanner.nextInt();
        System.out.println("Enter the height of Image (in pixels):");
        int height=scanner.nextInt();
        ImageValidatorSystem i=new ImageValidatorSystem();
        try {
			if(i.validateImageSize(size)&&i.validateImageResolution(width, height))
			{
				double data=i.calculateUploadCost(size);
				System.out.println("Thank you for uploading the image");
				System.out.println("Upload cost: $"+data);
			}
			
		} catch (InvalidDataException e) {
			System.out.println(e.getMessage());
		}
        
    }
}