package com.fouram.nurumikeyboard.NurumiIME;


//import android.content.Context;
import android.inputmethodservice.InputMethodService;
//import android.inputmethodservice.Keyboard;
//import android.inputmethodservice.KeyboardView;
import android.inputmethodservice.KeyboardView.OnKeyboardActionListener;
//import android.view.KeyEvent;
import android.view.View;
//import android.view.inputmethod.InputConnection;

public class NurumiIME extends InputMethodService implements
		OnKeyboardActionListener {
	
	//private KeyboardView kv;
	//private Keyboard keyboard;
	private View mKeyboardView;
	//private boolean caps = false;
		
	@Override
	public View onCreateInputView() {
		mKeyboardView = (View)getLayoutInflater().inflate(R.layout.mkeyboardlayout, null);
		/*
		kv = (KeyboardView)getLayoutInflater().inflate(R.layout.keyboard, null);
	    //keyboard = new Keyboard(this, R.layout.mkeyboardlayout);
	    keyboard = new Keyboard(this, R.xml.qwerty);
	    kv.setKeyboard(keyboard);
	    kv.setOnKeyboardActionListener(this);
	    return kv;
	    */
		return mKeyboardView;
	}
	
	@Override
	public void onPress(int primaryCode) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onRelease(int primaryCode) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onKey(int primaryCode, int[] keyCodes) {       
	    /*
		InputConnection ic = getCurrentInputConnection();
	    switch(primaryCode){
	    case Keyboard.KEYCODE_DELETE :
	        ic.deleteSurroundingText(1, 0);
	        break;
	    case Keyboard.KEYCODE_SHIFT:
	        caps = !caps;
	        keyboard.setShifted(caps);
	        kv.invalidateAllKeys();
	        break;
	    case Keyboard.KEYCODE_DONE:
	        ic.sendKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_ENTER));
	        break;
	    default:
	        char code = (char)primaryCode;
	        if(Character.isLetter(code) && caps){
	            code = Character.toUpperCase(code);
	        }
	        ic.commitText(String.valueOf(code),1);                 
	    }
	    */
	}

	@Override
	public void onText(CharSequence text) {
		// TODO Auto-generated method stub

	}

	@Override
	public void swipeLeft() {
		// TODO Auto-generated method stub

	}

	@Override
	public void swipeRight() {
		// TODO Auto-generated method stub

	}

	@Override
	public void swipeDown() {
		// TODO Auto-generated method stub

	}

	@Override
	public void swipeUp() {
		// TODO Auto-generated method stub

	}

}
