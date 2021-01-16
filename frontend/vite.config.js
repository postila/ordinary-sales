export default {
  proxy: {
    "/rest": {
      target: "http://localhost:5000",
      changeOrigin: true,
      ws: true
    }
  }
}