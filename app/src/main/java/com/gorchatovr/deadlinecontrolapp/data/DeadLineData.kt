package com.gorchatovr.deadlinecontrolapp.data

import java.sql.Time

data class DeadLineData(var name: String, var date: String, var time: Int, var isActive: Boolean = true)
