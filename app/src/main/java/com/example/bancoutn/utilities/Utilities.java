package com.example.bancoutn.utilities;

import android.text.Editable;

public abstract class Utilities {

    public static String round2(Double valor)
    {
        float f = valor.floatValue();
        return String.format("%.02f", f);
    }

    public static Double editableToDouble(Editable valor)
    {
        return Double.parseDouble(String.valueOf(valor));
    }

    //Metodo que extiende y sobreescribe los metodos inecesarios de TextWatcher
    public abstract class TextWatcherExtender implements TextWatcher
    {

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            // TODO Auto-generated method stub

        }

        //Este metodo tambien se debe sobreescribir
        public abstract void beforeTextChanged(CharSequence s, int start, int count, int after);
            
        

        //Metodo que es realmente util
        public abstract void afterTextChanged(Editable s);
    };
}
