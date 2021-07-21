package com.bignerdranch.android.geoquiz

import android.support.annotation.StringRes

//class Question {
//}

data class Question(@StringRes val textResId: Int, val answer: Boolean)