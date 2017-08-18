//package openCV-test;
import org.opencv.core.Core;
import org.opencv.core.CvType;  
import org.opencv.core.Mat; 
import org.opencv.core.MatOfKeyPoint;
import org.opencv.features2d.DescriptorExtractor;
import org.opencv.features2d.FeatureDetector;
public class main {    
        /** 
         * @param args 
         */  
        public static void main(String[] args) {  
            // TODO Auto-generated method stub  
           System.loadLibrary("opencv_java320");  
           // System.loadLibrary( Core.NATIVE_LIBRARY_NAME );
            Mat m  = Mat.eye(3, 3, CvType.CV_8UC1);  
            System.out.println("m = " + m.dump());  
        }  


}
