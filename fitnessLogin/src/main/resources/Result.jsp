<html>
<body style="background:#f0f4ff; font-family: Arial, sans-serif; padding: 30px;">

<div style="background: white; padding: 25px; border-radius: 10px; width: 350px; box-shadow: 0 0 10px rgba(0,0,0,0.2);">

<h1 style="color:#333; font-size:22px; margin-bottom:15px;">
    Register Status:
    <span style="color:green;">${Success}</span>
    <span style="color:red;">${Invalid}</span>
    <span style="color:red;">${Check}</span>
    <span style="color:red;">${Email}</span>
</h1>

<p style="font-size:16px; margin:5px 0;"><b>Name:</b> ${dto.name}</p>
<p style="font-size:16px; margin:5px 0;"><b>Email:</b> ${dto.email}</p>
<p style="font-size:16px; margin:5px 0;"><b>Age:</b> ${dto.age}</p>
<p style="font-size:16px; margin:5px 0;"><b>Gender:</b> ${dto.gender}</p>
<p style="font-size:16px; margin:5px 0;"><b>Weight:</b> ${dto.wight}</p>
<p style="font-size:16px; margin:5px 0;"><b>Height:</b> ${dto.height}</p>
<p style="font-size:16px; margin:5px 0;"><b>Address:</b> ${dto.address}</p>

</div>

</body>
</html>
