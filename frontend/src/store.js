import { createStore } from 'vuex'

const state = {
  sellers: []
}

const mutations = {
  setAllSellers(state, list) {
    state.sellers = list
  }
}

const actions = {
  async fetchAllSellers(store) {
    let list = await fetch('/rest/sellers')
    list = await list.json();

    console.log(list);
    store.commit('setAllSellers', list)
  }
}

export default createStore({ state, mutations, actions})