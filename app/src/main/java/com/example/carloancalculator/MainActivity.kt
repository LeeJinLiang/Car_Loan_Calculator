package com.example.carloancalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       buttonCalculate.setOnClickListener{

           val result:Double = editTextCarPrice.text.toString().toDouble() -  editTextDownPayment.text.toString().toDouble()
                   textViewLoan.text = "Car loan : RM %.2f".format(result)

           val interest:Double = result * editTextInterestRate.text.toString().toDouble() * editTextLoanPeriod.text.toString().toDouble()
           textViewInterest.text = "Car interest : RM %.2f".format(interest)

           val repayment:Double = (interest + result) / editTextLoanPeriod.text.toString().toDouble() / 12
           textViewMonthlyRepayment.text = "Monthly repayment = : RM %.2f".format(repayment)
       }

        buttonReset.setOnClickListener {
            editTextCarPrice.text = null;
            editTextDownPayment.text = null;
            editTextInterestRate.text = null;
            editTextLoanPeriod.text = null;


            textViewLoan.text = "Loan ";
            textViewInterest.text = "Interest ";
            textViewMonthlyRepayment.text = "Monthly Repayment ";
        }
    }


}
