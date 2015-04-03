package com.fouram.nurumikeyboard.NurumiIME;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.inputmethodservice.KeyboardView;
import android.util.AttributeSet;

/////////////////////////////////////////////
/// @class MKeyboardView
///com.fouram.nurumikeyboard.NurumiIME \n
///   �� MKeyboardView.java
/// @section Class information
///    |    Item    |    Contents    |
///    | :-------------: | -------------   |
///    | Company | 4:00 A.M. |    
///    | Author | Park, Hyung Soon |
///    | Date | 2015. 4. 3. |
/// @section Description
///  - View class of custom keyboard.\n
/////////////////////////////////////////////
public class MKeyboardView extends KeyboardView {
	Context context;
	
	/////////////////////////////////////////////
	/// @fn 
	/// @brief Constructor of MKeyboardView 
	/// @remark
	/// - Description : Get data from parent class (KeyboardView).
	/// @param context
	/// @param attrs 
	///~~~~~~~~~~~~~{.java}
	/// // core code
	///~~~~~~~~~~~~~
	/////////////////////////////////////////////
	public MKeyboardView(Context context, AttributeSet attrs) {
	    super(context, attrs);
	    this.context = context;
	}
	
	/////////////////////////////////////////////
	/// @fn 
	/// @brief (Override method) Draw screen
	/// @remark
	/// - Description Draw transparent background
	/// @see android.inputmethodservice.KeyboardView#onDraw(android.graphics.Canvas)
	/////////////////////////////////////////////
	public void onDraw(Canvas canvas) {
	    // TODO Auto-generated method stub
		super.onDraw(canvas);
	    canvas.drawColor(Color.TRANSPARENT);
	}
}