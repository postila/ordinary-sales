<template>
<router-view> </router-view>
</template>

<script>


export default {
  name: 'App',
  components: {

  },
  created(){
    this.$store.dispatch('fetchAllSellers')
  }
}
</script>
