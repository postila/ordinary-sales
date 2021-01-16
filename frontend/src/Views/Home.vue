<template>
  <h1>HELLO PONTUS</h1>
  <p>{{sellers}}</p>
</template>

<script>
export default {
  computed: {
    sellers(){
      return this.$store.state.sellers
    }
  },
}
</script>

<style>

</style>