package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CalController implements Initializable {

	@FXML
	Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
	@FXML
	Button btnCL, btnEQ, btnPL, btnMI, btnMU, btnDI;
	@FXML
	Label lblR, lblD;

	String op;
	String num = "";
	int n, x, y, result;

	private CalModel model = new CalModel();

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}

	// btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9
	public void btn0Action(ActionEvent event) {
		n=0;
        makenum(n);

	}

	public void btn1Action(ActionEvent event) {
		n=1;
        makenum(n);

	}

	public void btn2Action(ActionEvent event) {
		n=2;
        makenum(n);

	}

	public void btn3Action(ActionEvent event) {
		n=3;
        makenum(n);

	}

	public void btn4Action(ActionEvent event) {
		n=4;
        makenum(n);

	}

	public void btn5Action(ActionEvent event) {
		n=5;
        makenum(n);

	}

	public void btn6Action(ActionEvent event) {
		n=6;
        makenum(n);

	}

	public void btn7Action(ActionEvent event) {
		n=7;
        makenum(n);

	}

	public void btn8Action(ActionEvent event) {
		n=8;
        makenum(n);

	}

	public void btn9Action(ActionEvent event) {
		n=9;
        makenum(n);

	}

	// btnCL, btnEQ, btnPL, btnMI, btnMU, btnDI
	public void btnCLAction(ActionEvent event) { // "C"
		lblR.setText("");
		lblD.setText("");
	}

	public void btnMIAction(ActionEvent event) { // "-"
		op="-";
        makelog(op);

	}

	public void btnPLAction(ActionEvent event) { // "+"
		op="+";
        makelog(op);

	}

	public void btnDIAction(ActionEvent event) { // "/"
		op="/";
        makelog(op);

	}

	public void btnMUAction(ActionEvent event) { // "*"
		op="*";
        makelog(op);

	}

	public void makenum(int n) {
		num = lblR.getText();
		lblR.setText(num + Integer.toString(n));
	}

	public void makelog(String op) {
		x = Integer.parseInt(lblR.getText());
		lblR.setText("");
		lblD.setText(Integer.toString(x) + " " + op + " ");
	}

	public void btnEQAction(ActionEvent event) { // "="
		y = Integer.parseInt(lblR.getText());
		num = lblD.getText();

		lblD.setText(num + y + " = ");
		result = model.calculate(op, x, y); // ("+", 5, 3)
//	    result=0;
		lblR.setText(Integer.toString(result));

		num = lblD.getText();
		lblD.setText(num + result);
	}

}
