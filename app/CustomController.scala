package com.petike.home.controllers

import play.api.mvc.Action
import play.api.mvc.Controller

class CustomController extends Controller {

  def user = Action {
    Ok("It works!")
  }
}
