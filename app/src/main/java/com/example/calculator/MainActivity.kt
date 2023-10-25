package com.example.calculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.calculator.databinding.MainActivityBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:MainActivityBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater);
        setContentView(binding.root)

        var equation : String = "";
        var result : Float = 0f;
        var firstNumber : Int? = null;
        var secondNumber : Int? = null;
        var dau : String = "";

        binding.one.setOnClickListener{
            val buttonValue : Int = 1;
            if (firstNumber==null) {
                firstNumber= buttonValue;
            } else {
                if (dau == "") {
                    firstNumber= firstNumber!! *10+buttonValue;
                } else {
                    if (secondNumber==null) {
                        secondNumber = buttonValue;
                    } else {
                        secondNumber = secondNumber!! *10 + buttonValue;
                    }
                }
            }
            setEquation(firstNumber, dau, secondNumber);
        }

        binding.two.setOnClickListener{
            val buttonValue : Int = 2;
            if (firstNumber==null) {
                firstNumber= buttonValue;
            } else {
                if (dau == "") {
                    firstNumber= firstNumber!! *10+buttonValue;
                } else {
                    if (secondNumber==null) {
                        secondNumber = buttonValue;
                    } else {
                        secondNumber = secondNumber!! *10 + buttonValue;
                    }
                }
            }
            setEquation(firstNumber, dau, secondNumber);
        }

        binding.three.setOnClickListener{
            val buttonValue : Int = 3;
            if (firstNumber==null) {
                firstNumber= buttonValue;
            } else {
                if (dau == "") {
                    firstNumber= firstNumber!! *10+buttonValue;
                } else {
                    if (secondNumber==null) {
                        secondNumber = buttonValue;
                    } else {
                        secondNumber = secondNumber!! *10 + buttonValue;
                    }
                }
            }
            setEquation(firstNumber, dau, secondNumber);
        }

        binding.four.setOnClickListener{
            val buttonValue : Int = 4;
            if (firstNumber==null) {
                firstNumber= buttonValue;
            } else {
                if (dau == "") {
                    firstNumber= firstNumber!! *10+buttonValue;
                } else {
                    if (secondNumber==null) {
                        secondNumber = buttonValue;
                    } else {
                        secondNumber = secondNumber!! *10 + buttonValue;
                    }
                }
            }
            setEquation(firstNumber, dau, secondNumber);
        }

        binding.five.setOnClickListener{
            val buttonValue : Int = 5;
            if (firstNumber==null) {
                firstNumber= buttonValue;
            } else {
                if (dau == "") {
                    firstNumber= firstNumber!! *10+buttonValue;
                } else {
                    if (secondNumber==null) {
                        secondNumber = buttonValue;
                    } else {
                        secondNumber = secondNumber!! *10 + buttonValue;
                    }
                }
            }
            setEquation(firstNumber, dau, secondNumber);
        }

        binding.six.setOnClickListener{
            val buttonValue : Int = 6;
            if (firstNumber==null) {
                firstNumber= buttonValue;
            } else {
                if (dau == "") {
                    firstNumber= firstNumber!! *10+buttonValue;
                } else {
                    if (secondNumber==null) {
                        secondNumber = buttonValue;
                    } else {
                        secondNumber = secondNumber!! *10 + buttonValue;
                    }
                }
            }
            setEquation(firstNumber, dau, secondNumber);
        }

        binding.seven.setOnClickListener{
            val buttonValue : Int = 7;
            if (firstNumber==null) {
                firstNumber= buttonValue;
            } else {
                if (dau == "") {
                    firstNumber= firstNumber!! *10+buttonValue;
                } else {
                    if (secondNumber==null) {
                        secondNumber = buttonValue;
                    } else {
                        secondNumber = secondNumber!! *10 + buttonValue;
                    }
                }
            }
            setEquation(firstNumber, dau, secondNumber);
        }

        binding.eight.setOnClickListener{
            val buttonValue : Int = 8;
            if (firstNumber==null) {
                firstNumber= buttonValue;
            } else {
                if (dau == "") {
                    firstNumber= firstNumber!! *10+buttonValue;
                } else {
                    if (secondNumber==null) {
                        secondNumber = buttonValue;
                    } else {
                        secondNumber = secondNumber!! *10 + buttonValue;
                    }
                }
            }
            setEquation(firstNumber, dau, secondNumber);
        }

        binding.nine.setOnClickListener{
            val buttonValue : Int = 9;
            if (firstNumber==null) {
                firstNumber= buttonValue;
            } else {
                if (dau == "") {
                    firstNumber= firstNumber!! *10+buttonValue;
                } else {
                    if (secondNumber==null) {
                        secondNumber = buttonValue;
                    } else {
                        secondNumber = secondNumber!! *10 + buttonValue;
                    }
                }
            }
            setEquation(firstNumber, dau, secondNumber);
        }

        binding.zero.setOnClickListener{
            val buttonValue : Int = 0;
            if (firstNumber==null) {
                firstNumber= buttonValue;
            } else {
                if (dau == "") {
                    firstNumber= firstNumber!! *10+buttonValue;
                } else {
                    if (secondNumber==null) {
                        secondNumber = buttonValue;
                    } else {
                        secondNumber = secondNumber!! *10 + buttonValue;
                    }
                }
            }
            setEquation(firstNumber, dau, secondNumber);
        }

        binding.plus.setOnClickListener {
            val buttonValue : String = "+";
            if (dau == "") {
                dau = buttonValue;
                setEquation(firstNumber, dau, secondNumber);
            } else {
                dau = calc(firstNumber, dau, secondNumber, buttonValue)
                firstNumber = binding.result.text.toString().toFloat().toInt()
                secondNumber = null
                setEquation(firstNumber, dau, secondNumber);
            }
        }

        binding.minus.setOnClickListener {
            val buttonValue : String = "-";
            if (dau == "") {
                dau = buttonValue;
                setEquation(firstNumber, dau, secondNumber);
            } else {
                dau = calc(firstNumber, dau, secondNumber, buttonValue)
                firstNumber = binding.result.text.toString().toFloat().toInt()
                secondNumber = null
                setEquation(firstNumber, dau, secondNumber);
            }
        }

        binding.multiplication.setOnClickListener {
            val buttonValue : String = "x";
            if (dau == "") {
                dau = buttonValue;
                setEquation(firstNumber, dau, secondNumber);
            } else {
                dau = calc(firstNumber, dau, secondNumber, buttonValue)
                firstNumber = binding.result.text.toString().toFloat().toInt()
                secondNumber = null
                setEquation(firstNumber, dau, secondNumber);
            }
        }

        binding.division.setOnClickListener {
            val buttonValue : String = "/";
            if (dau == "") {
                dau = buttonValue;
                setEquation(firstNumber, dau, secondNumber);
            } else {
                dau = calc(firstNumber, dau, secondNumber, buttonValue)
                firstNumber = binding.result.text.toString().toFloat().toInt()
                secondNumber = null
                setEquation(firstNumber, dau, secondNumber);
            }
        }

        binding.equal.setOnClickListener {
            calc(firstNumber, dau, secondNumber);
        }

        binding.clearButton.setOnClickListener {
            firstNumber = null;
            dau = "";
            secondNumber = null;
            setEquation();
            binding.result.setText("0");
        }

        binding.backspace.setOnClickListener {
            if (secondNumber != null) {
                secondNumber = (secondNumber!!.toFloat()/10f).toInt()
                if (secondNumber == 0) secondNumber=null
            } else {
                if (firstNumber != null) {
                    firstNumber = (firstNumber!!.toFloat()/10).toInt()
                    if (firstNumber == 0) firstNumber=null
                }
            }
            setEquation(firstNumber, dau, secondNumber)
        }
    }

    fun setEquation(firstNumber : Int? = null, dau : String = "", secondNumber:Int? = null):Unit {
        var text : String;
        if (firstNumber == null) {
            text = "";
        } else {
            if (dau == "") {
                text = firstNumber!!.toString();
            } else {
                if (secondNumber==null) {
                    text = firstNumber!!.toString() + " " + dau;
                } else {
                    text = firstNumber!!.toString() + " " + dau + " " + secondNumber!!.toString();
                }
            }
        }
        binding.equation.text = text;
    }

    fun calc(firstNumber : Int?, dau :String, secondNumber: Int?, nextDau : String = ""):String {
        if (firstNumber == null || dau == "" || secondNumber == null)
            return "";

        var result : Float = 0f;
        if (dau == "+") {
            result = firstNumber!!.toFloat() + secondNumber!!.toFloat();
        }
        if (dau == "-") {
            result = firstNumber!!.toFloat() - secondNumber!!.toFloat();
        }
        if (dau == "x") {
            result = firstNumber!!.toFloat() * secondNumber!!.toFloat();
        }
        if (dau == "/") {
            result = firstNumber!!.toFloat() / secondNumber!!.toFloat();
        }

        binding.result.setText(result.toString())
        return nextDau
    }
}
