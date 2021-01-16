import { createRouter, createWebHistory } from 'vue-router'

import Home from './Views/Home.vue'
import Login from './Views/Login.vue'

const routes = [
  {
    name: "Home",
    path: "/",
    component: Home
  },
  {
    name: "Login",
    path: "/login",
    component: Login
  }
]

export default createRouter({
  history: createWebHistory(),
  routes
});