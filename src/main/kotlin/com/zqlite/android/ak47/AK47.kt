/*
 * Copyright 2017 zhangqinglian
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.zqlite.android.ak47

import android.content.Context
import android.content.SharedPreferences
import android.support.v7.app.AlertDialog

/**
 * Created by scott on 2017/8/25.
 */

/********************************************** SharePreference **********************************************/
fun SharedPreferences.save(func: SharedPreferences.Editor.()->Unit){
    val edit = edit()
    edit.func()
    edit.apply()
}

fun SharedPreferences.Editor.set(pair: Pair<String,String>) = putString(pair.first,pair.second)

fun Context.getSPString(name:String, key:String, default:String) = getSharedPreferences(name,Context.MODE_PRIVATE).getString(key,default)


/********************************************** Dialog **********************************************/

fun AlertDialog.Builder.show(func : AlertDialog.Builder.()->Unit){
    func()
    show()
}