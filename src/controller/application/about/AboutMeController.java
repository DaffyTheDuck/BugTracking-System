
package controller.application.about;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class AboutMeController implements Initializable {
    @FXML
//    private ImageView imgMyImg;
    
    Image image = new Image("/image/image-1.jpg");

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
//        imgMyImg.setImage(image);
    }    
    
}
