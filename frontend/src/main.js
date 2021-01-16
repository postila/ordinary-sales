import { createApp } from 'vue'
import App from './App.vue'
import './index.css'
import store from './store.js'
import router from './router.js'

let app = createApp(App);

app.use(store);
app.use(router);

app.mount('#app');
