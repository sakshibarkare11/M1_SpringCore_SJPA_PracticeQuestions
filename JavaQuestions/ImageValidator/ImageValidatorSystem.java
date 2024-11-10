
public class ImageValidatorSystem {
	public boolean validateImageSize(int imageSize) throws InvalidDataException {
       if(imageSize<=20)
       {
    	   return true;
       }
       else
       {
    	   throw new InvalidDataException("Image Size exceeds 20KB");
       }
    }

    public boolean validateImageResolution(int width, int height) throws InvalidDataException  {
         if(width*height<=1024*768)
         {
        	 return true;
         }
         else
         {
        	 throw new InvalidDataException("Image Resolution exceeds 1024x768 pixels");
         }
    }

    public double calculateUploadCost(int imageSize) {
         double data=imageSize-10;
         if(data<=10)
         {
        	 return data*0.50;
         }
        return 0.0;
    }
}
