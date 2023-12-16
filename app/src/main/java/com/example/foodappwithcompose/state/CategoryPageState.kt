package com.example.foodappwithcompose.state

import com.example.foodappwithcompose.model.MealsResponse


sealed class CategoryPageState{
    object Loading : CategoryPageState()
    data class Success(val mealDetailResponse: MealsResponse,val categoryName:String) : CategoryPageState()
    data class Error(val error: String) : CategoryPageState()
}
